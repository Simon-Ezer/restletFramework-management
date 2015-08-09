package com.simon.restletframework;

import org.restlet.resource.*;

/**
 * base resource demo
 */
public class BaseCampResource extends ServerResource {

    @Get("txt")
    public String createMethod() {
        return "createMethod";
    }


    @Post("txt")
    public String RetrieveMethod() {
        return "RetrieveMethod";
    }

    @Put("txt")
    public String updateMethod() {
        return "updateMethod";
    }

    @Delete("txt")
    public String deleteMethod() {
        return "deleteMethod";
    }
    
}