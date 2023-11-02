package org.delta.bank.account;

import com.google.gson.Gson;
import com.google.inject.Inject;
import org.delta.bank.people.Owner;
import org.delta.bank.print.LoggerService;

import java.awt.*;

public class OwnerStringService {

    @Inject private LoggerService loggerService;
    @Inject private Gson gson;
    public String jsonSerializeOwner (Owner owner){
        return this.gson.toJson(owner);
    }
    /*public String parseOwner(Owner owner) {
        String attr = ("{\"firstname\":\""+ owner.getFirstname()+"\", \"lastname\": \""+ owner.getLastname()+"\"}");
        loggerService.log(attr);
        return (attr);
    }*/

}

