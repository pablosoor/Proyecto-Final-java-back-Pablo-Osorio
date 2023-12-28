package com.edp.ProyectoFinalJava.controller;

import com.edp.ProyectoFinalJava.moduls.ClienteRegular;
import com.edp.ProyectoFinalJava.moduls.Comestible;
import com.edp.ProyectoFinalJava.moduls.Electronico;
import com.edp.ProyectoFinalJava.moduls.Ropa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class TiendaController {
    List<Ropa> ropas = new ArrayList<>();
    List<Electronico> electronicos = new ArrayList<>();
    List<Comestible> comidas = new ArrayList<>();


    public List<Ropa> getListRopa(){
        ropas.add(new Ropa("remera negra",100.0, 1,"M","https://www.google.com/url?sa=i&url=https%3A%2F%2Fpruebaed.mitiendanube.com%2Fproductos%2Fremera-negra-basica%2F&psig=AOvVaw0KovG_I8CfGOQsaaOokZEv&ust=1703790871297000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCMioj9-psIMDFQAAAAAdAAAAABAD"));
        ropas.add(new Ropa("remera roja",200.0, 2,"S","https://www.google.com/url?sa=i&url=https%3A%2F%2Flistado.mercadolibre.com.ar%2Fremera-roja-nene&psig=AOvVaw0IrPYPskTArpxZtyrgaKVz&ust=1703790901282000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCIDNse6psIMDFQAAAAAdAAAAABAD"));
        ropas.add(new Ropa("remera azul",300.0, 3,"L", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fpda.com.ar%2Fproductos%2Fremera-azul-spun%2F&psig=AOvVaw2m8fM7zcEjxsHsZlZW60k-&ust=1703790925928000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKjTz_mpsIMDFQAAAAAdAAAAABAD"));
        return ropas;
    }

    public List<Electronico> getListElectronico(){
        electronicos.add(new Electronico("Televisor",100.000,1,"Samsung","https://images.samsung.com/is/image/samsung/p6pim/ar/qn55q65bagczb/gallery/ar-qled-q60b-qn55q65bagczb-534377581?$650_519_PNG$"));
        electronicos.add(new Electronico("microondas",500.000,2,"Samsung","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.samsung.com%2Far%2Fmicrowave-ovens%2Fgrill%2Fmicrowave-oven-grill-mg23f3k3tak%2F&psig=AOvVaw1EziX19gK-hp_BqGDDLmSN&ust=1703791196422000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCICV7fmqsIMDFQAAAAAdAAAAABAR"));
        electronicos.add(new Electronico("heladera",1000.000,3,"Samsung","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.samsung.com%2Far%2Frefrigerators%2Ftop-mount-freezer%2F318l-ez-clean-steel-rt32k5930sl-b3%2F&psig=AOvVaw2sQUf-9QqLvj8cQg7KqkeV&ust=1703791233032000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJCTqIursIMDFQAAAAAdAAAAABAG"));
        return electronicos;
    }

    public List<Comestible> getListComestible(){
        comidas.add(new Comestible("Hamburguesa", 100.00,1,"Doble Hamburguesa con doble queso", "https://argentinaburger.com/wp-content/uploads/2023/10/New-WM-AB-2023-12-25T163250.961.jpg"));
        comidas.add(new Comestible("ensalada", 45.00,2," ensalada cesar", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.gourmet.cl%2Frecetas%2Fensalada-cesar%2F&psig=AOvVaw2znq-T_716flCZoRxAtBG3&ust=1703792008403000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOjnrf2tsIMDFQAAAAAdAAAAABAD"));
        comidas.add(new Comestible("pizza", 200.00,3,"pizza especial con morrones", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tripadvisor.es%2FLocationPhotoDirectLink-g312781-d8097707-i235546373-La_Pizza-Mendoza_Province_of_Mendoza_Cuyo.html&psig=AOvVaw2qKII2XM9TtsKVUJ76pM00&ust=1703792046669000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCIje2I-usIMDFQAAAAAdAAAAABAR"));
        return comidas;
    }

    @GetMapping("/articulos")
    public String mostrarArticulos(Model model) {
        List<Ropa> ropas = getListRopa();
        List<Electronico> electronicos = getListElectronico();
        List<Comestible> comidas = getListComestible();

        model.addAttribute("ropas", ropas);
        model.addAttribute("electronicos", electronicos);
        model.addAttribute("comidas", comidas);

        return "articulos";
    }

}

