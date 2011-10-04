package com.osgiknowhow.sandbox.client;

import com.osgiknowhow.sandbox.PigLatinService;

public class PigLatinClient {
    public void tryIt() {
        System.out.println("TRANSLATED:  " + 
            pigLatinService.translate("This is in pig latin"));
    }
    
    private PigLatinService pigLatinService;
    public void setPigLatinService(PigLatinService pigLatinService) {
        this.pigLatinService = pigLatinService;
    }
}
