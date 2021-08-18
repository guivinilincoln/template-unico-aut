package pages;

import base.BaseApi;

public class RequisicaoEndPointPage extends BaseApi {

    private final BaseApi base;

    public RequisicaoEndPointPage(BaseApi base){
        this.base = base;
    }

    public void realizarPost(String massa, String operacao){
        base.response = base.resquest.
                body(massa).
                when().
                post(base.url + operacao);
    }

    public void realizarGet(String operacao){
        base.response = base.resquest.
                when().
                get(base.url + operacao);
        base.response.then();
    }
}
