package animal;

import Rule.*;

public class animalBR {

    //    declaracion de base de reglas
    BooleanRuleBase br = new BooleanRuleBase("test");
    //    declaracion de variables de regla
    RuleVariable Sangrecaliente;
    RuleVariable Plumas;
    RuleVariable Metamorfosis;
    RuleVariable Respiracionbranquial;
    
    //Ave
    RuleVariable Corre;
    RuleVariable Vuela;

    //Anfibio
    RuleVariable Patas; //Tambien usado en Reptil
    RuleVariable Cola;
    RuleVariable CuerpoAlargado;
    
    //Mamifero
    RuleVariable Placenta;
    RuleVariable BolsaAbdominal;
    RuleVariable Oviparo;
    
    //Reptil
    RuleVariable MudaPiel;
    RuleVariable Caparazon;
    RuleVariable ColaNadar;
    RuleVariable CabezaPico;
    RuleVariable EsqCartilago;
    RuleVariable EsqOseo;
    /*RuleVariable Patas;*/
    RuleVariable DientesVisibles;
    
    RuleVariable Vertebrado1;
    RuleVariable Vertebrado2;
    RuleVariable Vertebrado3;
    String svertebrado;

    public void BaseReglas() {
    }

    public String getVertebrado1(String sangrecaliente,
            String plumas, String respiracionbranquial,
            String metamorfosis)
    {
        staterBR();
        Sangrecaliente.setValue(sangrecaliente);
        Plumas.setValue(plumas);
        Respiracionbranquial.setValue(respiracionbranquial);
        Metamorfosis.setValue(metamorfosis);

        br.forwardChain();
        svertebrado = Vertebrado1.getValue();

        return svertebrado;
    }

    public String getVertebrado2(String v1,String corre, String vuela,
                                 String patas, String cola, String cuerpoAlargado,
                                 String placenta, String bolsaAbdominal, String oviparo,
                                 String mudapiel, String caparazon, String colanadar, String cabezapico) 
    {
        staterBR();
        Vertebrado1.setValue(v1);
        
        //Ave
        Corre.setValue(corre);
        Vuela.setValue(vuela);
        
        //Anfibio
        Patas.setValue(patas);
        Cola.setValue(cola);
        CuerpoAlargado.setValue(cuerpoAlargado);
       
        //Mamifero
        Placenta.setValue(placenta);
        BolsaAbdominal.setValue(bolsaAbdominal);
        Oviparo.setValue(oviparo);
        
        //Reptil
        MudaPiel.setValue(mudapiel);
        Caparazon.setValue(caparazon);
        ColaNadar.setValue(colanadar);
        CabezaPico.setValue(cabezapico);
        
        
        br.forwardChain();
        svertebrado = Vertebrado2.getValue();

        return svertebrado;
    }
    
    public String getVertebrado3(String v2, String patas, String dientesvisibles)
    {
        staterBR();
        Vertebrado2.setValue(v2);
        
        Patas.setValue(patas);
        DientesVisibles.setValue(dientesvisibles);
        
        br.forwardChain();
        svertebrado = Vertebrado3.getValue();

        return svertebrado;
    }

    public void staterBR() {
        //        instancias de variables de regla
        Sangrecaliente = new RuleVariable(br, "Sangrecaliente");
        Plumas = new RuleVariable(br, "Plumas");
        Metamorfosis = new RuleVariable(br, "Metamorfosis");
        Respiracionbranquial = new RuleVariable(br, "Respiracionbranquial");
        
        //Ave
        Corre= new RuleVariable(br, "Corre");
        Vuela= new RuleVariable(br, "Vuela");
        
        //Anfibio
        Patas= new RuleVariable(br, "Patas");
        Cola= new RuleVariable(br, "Cola");
        CuerpoAlargado= new RuleVariable(br, "CuerpoAlargado");
        
        //Mamifero
        Placenta= new RuleVariable(br, "Placenta");
        BolsaAbdominal= new RuleVariable(br, "BolsaAbdominal");
        Oviparo= new RuleVariable(br, "Oviparo");
        
        //Reptil
        MudaPiel= new RuleVariable(br, "MudaPiel");
        Caparazon= new RuleVariable(br, "Caparazon");
        ColaNadar= new RuleVariable(br, "ColaNadar");
        CabezaPico= new RuleVariable(br, "CabezaPico");
        //lvl2------------------------------------------
        DientesVisibles= new RuleVariable(br, "DientesVisibles");
        
        Vertebrado1 = new RuleVariable(br, "Vertebrado1");
        Vertebrado2 = new RuleVariable(br, "Vertebrado2");
        Vertebrado3 = new RuleVariable(br, "Vertebrado3");

        //        definicion de operadores logicos (condicionales)
        Condition igual = new Condition("=");

        //        creacion de reglas de validacion (Base de Reglas)
        // VERTEBRADOS 1   
        Rule ave = new Rule(br, "AVE",
                            new Clause[]
                            {
                                new Clause(Sangrecaliente, igual, "si"),
                                new Clause(Plumas, igual, "si"),
                                new Clause(Respiracionbranquial, igual, "no"),
                                new Clause(Metamorfosis, igual, "no")
                            }, new Clause(Vertebrado1, igual, "AVE"));
       
        Rule mamifero = new Rule(br, "MAMIFERO",
                        new Clause[]
                        {
                            new Clause(Sangrecaliente, igual, "si"), 
                            new Clause(Plumas, igual, "no"), 
                            new Clause(Respiracionbranquial, igual, "no"), 
                            new Clause(Metamorfosis, igual, "no")
                        }, new Clause(Vertebrado1, igual, "MAMIFERO"));
    
        Rule reptil = new Rule(br, "REPTIL",
                            new Clause[]
                            {
                                new Clause(Sangrecaliente, igual, "no"), 
                                new Clause(Plumas, igual, "no"), 
                                new Clause(Respiracionbranquial, igual, "no"), 
                                new Clause(Metamorfosis, igual, "no")
                            }, new Clause(Vertebrado1, igual, "REPTIL"));
    
        Rule pez = new Rule(br, "PEZ",
                            new Clause[]
                            {
                                new Clause(Sangrecaliente, igual, "no"), 
                                new Clause(Plumas, igual, "no"), 
                                new Clause(Respiracionbranquial, igual, "si"), 
                                new Clause(Metamorfosis, igual, "no")
                            }, new Clause(Vertebrado1, igual, "PEZ"));
        
        Rule anfibio = new Rule(br, "ANFIBIO",
                                new Clause[]
                                {
                                    new Clause(Sangrecaliente, igual, "no"), 
                                    new Clause(Plumas, igual, "no"), 
                                    new Clause(Respiracionbranquial, igual, "no"), 
                                    new Clause(Metamorfosis, igual, "si")
                                }, new Clause(Vertebrado1, igual, "ANFIBIO"));
        
        
         // VERTEBRADOS 2
         Rule paleognathae = new Rule(br, "PALEOGNATHAE",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "AVE"),
                                        new Clause(Corre, igual, "si"),
                                        new Clause(Vuela, igual, "no")
                                    }, new Clause(Vertebrado2, igual, "PALEOGNATHAE"));
    
        Rule neognathae = new Rule(br, "NEOGNATHAE",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "AVE"),
                                        new Clause(Corre, igual, "si"),
                                        new Clause(Vuela, igual, "si")
                                    }, new Clause(Vertebrado2, igual, "NEOGNATHAE"));
        
        Rule apodo = new Rule(br, "APODO",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "ANFIBIO"),
                                        new Clause(Patas, igual, "no"),
                                        new Clause(Cola, igual, "si"),
                                        new Clause(CuerpoAlargado, igual, "si")
                                    }, new Clause(Vertebrado2, igual, "APODO"));
        
        Rule urodelo = new Rule(br, "URODELO",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "ANFIBIO"),
                                        new Clause(Patas, igual, "si"),
                                        new Clause(Cola, igual, "si"),
                                        new Clause(CuerpoAlargado, igual, "si")
                                    }, new Clause(Vertebrado2, igual, "URODELO"));
        
        Rule anuro = new Rule(br, "ANURO",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "ANFIBIO"),
                                        new Clause(Patas, igual, "si"),
                                        new Clause(Cola, igual, "no"),
                                        new Clause(CuerpoAlargado, igual, "no")
                                    }, new Clause(Vertebrado2, igual, "ANURO"));
        
        Rule eutheria = new Rule(br, "EUTHERIA",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "MAMIFERO"),
                                        new Clause(Placenta, igual, "si"),
                                        new Clause(BolsaAbdominal, igual, "no"),
                                        new Clause(Oviparo, igual, "no")
                                    }, new Clause(Vertebrado2, igual, "EUTHERIA"));
        
        Rule metatheria = new Rule(br, "METATHERIA",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "MAMIFERO"),
                                        new Clause(Placenta, igual, "no"),
                                        new Clause(BolsaAbdominal, igual, "si"),
                                        new Clause(Oviparo, igual, "no")
                                    }, new Clause(Vertebrado2, igual, "METATHERIA"));
        
        Rule prototheria = new Rule(br, "PROTOTHERIA",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "MAMIFERO"),
                                        new Clause(Placenta, igual, "no"),
                                        new Clause(BolsaAbdominal, igual, "no"),
                                        new Clause(Oviparo, igual, "si")
                                    }, new Clause(Vertebrado2, igual, "PROTOTHERIA"));
        
        Rule squamata = new Rule(br, "SQUAMATA",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "REPTIL"),
                                        new Clause(MudaPiel, igual, "si"),
                                        new Clause(Caparazon, igual, "no"),
                                        new Clause(ColaNadar, igual, "no"),
                                        new Clause(CabezaPico, igual, "no"),
                                    }, new Clause(Vertebrado2, igual, "SQUAMATA"));
        
        Rule quelonia = new Rule(br, "QUELONIA",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "REPTIL"),
                                        new Clause(MudaPiel, igual, "no"),
                                        new Clause(Caparazon, igual, "si"),
                                        new Clause(ColaNadar, igual, "no"),
                                        new Clause(CabezaPico, igual, "no"),
                                    }, new Clause(Vertebrado2, igual, "QUELONIA"));
        
        Rule cocodrilia = new Rule(br, "COCODRILIA",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "REPTIL"),
                                        new Clause(MudaPiel, igual, "no"),
                                        new Clause(Caparazon, igual, "no"),
                                        new Clause(ColaNadar, igual, "si"),
                                        new Clause(CabezaPico, igual, "no"),
                                    }, new Clause(Vertebrado2, igual, "COCODRILIA"));
        
        Rule Rinocefalo = new Rule(br, "RINOCEFALO",
                                    new Clause[]
                                    {
                                        new Clause(Vertebrado1, igual, "REPTIL"),
                                        new Clause(MudaPiel, igual, "no"),
                                        new Clause(Caparazon, igual, "no"),
                                        new Clause(ColaNadar, igual, "no"),
                                        new Clause(CabezaPico, igual, "si"),
                                    }, new Clause(Vertebrado2, igual, "RINOCEFALO"));
    }
}
