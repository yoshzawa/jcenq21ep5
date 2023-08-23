package jp.ac.jc21.t.yoshizawa;

import io.micronaut.http.annotation.*;

@Controller("/jcenq21ep5")
public class Jcenq21ep5Controller {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}