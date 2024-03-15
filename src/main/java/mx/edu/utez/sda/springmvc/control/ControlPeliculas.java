package mx.edu.utez.sda.springmvc.control;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/peliculas")
public class ControlPeliculas {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @Secured({"ROLE_RECE", "ROLE_INFANTIL", "ROLE_ADULTO"})
    public String index(){
        return "peliculas";
    }

    @RequestMapping(value = "/infantil", method = RequestMethod.GET)
    @Secured({"ROLE_INFANTIL", "ROLE_ADULTO"})
    public String infantil(){
        return "peliculasInfantil";
    }

    @RequestMapping(value = "/aventura", method = RequestMethod.GET)
    @Secured({"ROLE_INFANTIL", "ROLE_ADULTO"})
    public String aventura(){
        return "aventura";
    }

    @RequestMapping(value = "/adulto", method = RequestMethod.GET)
    @Secured({"ROLE_ADULTO"})
    public String adulto(){
        return "peliculasAdulto";
    }

    @RequestMapping(value = "/terror", method = RequestMethod.GET)
    @Secured({"ROLE_ADULTO"})
    public String terror(){
        return "terror";
    }

}
