package com.D.Daid.controllers;
 
import com.D.Daid.models.DaidModel;
import com.D.Daid.services.DaidBDService;
import com.D.Daid.services.DaidService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HolaMundo {
   @RequestMapping("/")
   public String saludar(){
       return "Esta es tu primera página web backend";
   }
 
   @RequestMapping("/despidete")
   public String despidete(){
       return "Adios amigo";
   }


   @GetMapping("/contar/{frase}")
   public String contar(@PathVariable String frase) {
        int contCons=0;
        int contVoc=0;
        char[] vocales= {'a','e','i','o','u'};
        char[] consonantes={'b','c','d','f','g','h','j','k','l','m','n',
                        'ñ','q','r','s','t','v','w','x','y','z'};
        for(int i=0;i<frase.length();i++){
            for(int j=0;j<vocales.length;j++){
                if(frase.charAt(i) == vocales[j]){
                    contVoc++;
                }
            }
            for(int j=0;j<consonantes.length;j++){
                if(frase.charAt(i) == consonantes[j]){
                    contCons++;
                }
            }
        }
        return "Numero de consonantes: " + contCons + "\n" + "Numero de vocales: "+ contVoc;
   }



    @GetMapping("/guardaDaid/{nombre}&{alto}&{ancho}&{largo}&{color}&{numExtremidades}&{cuernos}")
    public String guardarNuevoDaid(@RequestParam String nombre, Integer alto, Integer ancho, Integer largo, String color, Integer numExtremidades, boolean cuernos) {

        DaidModel daid = new DaidModel();
        daid.setNombre(nombre);
        daid.setAlto(alto);
        daid.setAncho(ancho);
        daid.setLargo(largo);
        daid.setColor(color);
        daid.setNumExtremidades(numExtremidades);
        daid.setCuernos(cuernos);

        daidBDService.guardarDaid(daid);

        return "Los datos han sido guardados";
    }
    
   @Autowired
   DaidBDService daidBDService;

   @GetMapping("/listarDaids")
   public String daids() {
       return daidBDService.obtenerDaid().toString();
   }



   @GetMapping("/{texto}")
    public String cambiarBV(@PathVariable String texto) {
        return texto.replace("b","_").replace("v","_")
        .replace("B","_").replace("V","_");
    }


    @Autowired 
    DaidService daidService;
    
    @GetMapping("/traduce/{texto}")
    public String traduce() {
        String textoTraducido = daidService.getTraduccion();
        return "Traduccion: "+ textoTraducido;
    }

}

