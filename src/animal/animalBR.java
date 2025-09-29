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
    RuleVariable Corre;
    RuleVariable Vuela;
    
    // Regla Reptil v2
    RuleVariable mudaPiel;
    RuleVariable caparazon;
    RuleVariable colaNadar;
    RuleVariable cabezaPico;
    
    //Regla V3 Squamata
    RuleVariable patas;
    RuleVariable veneno;
    RuleVariable trepaArbol;
    RuleVariable tercOjoPar;
    RuleVariable lenguaBifi;
    
    RuleVariable Vertebrado1;
    RuleVariable Vertebrado2;
    RuleVariable Verte3;
    RuleVariable Verte4;
    RuleVariable Verte5;
    
    //regla v4 Anguidae
    RuleVariable arboricola;
    RuleVariable coloracionLlamativa;
    RuleVariable diurnos;
    RuleVariable escamasGrandesAcorazadas;
    
    //regla v5 Abronia
    RuleVariable endemicaOaxaca;
    RuleVariable bosqueNuboso;
    RuleVariable marcasOscuras;
    RuleVariable mayor40;
    
    RuleVariable habitatAcuatico;
    RuleVariable velociadAgresiva;
    RuleVariable patronColor;
    RuleVariable cabezaAncha;
    
    RuleVariable habitatArboreo;
    RuleVariable capacidadNadar;
    RuleVariable herbivoro;
    
    RuleVariable cuelloAnchoOscuro;
    RuleVariable anillosMedianos;
    RuleVariable zonaMontanosa;
    RuleVariable endemicaMexico;
    
    RuleVariable delgada;
    RuleVariable arborea;
    RuleVariable colaLarga;
    RuleVariable marcasClarasAbdomen;
    
    RuleVariable caparazonOseo;
    RuleVariable terrestre;
    RuleVariable amniota;
    RuleVariable alimentacionMedusa;
    
    RuleVariable herbivora;
    RuleVariable caparazonBordesCerrados;
    RuleVariable granTamano;
    
    String svertebrado;

    public void BaseReglas() {
    }

    public String getVertebrado1(String sangrecaliente,
        String plumas, String respiracionbranquial,
        String metamorfosis) {
        staterBR();
        Sangrecaliente.setValue(sangrecaliente);
        Plumas.setValue(plumas);
        Respiracionbranquial.setValue(respiracionbranquial);
        Metamorfosis.setValue(metamorfosis);

        br.forwardChain();
        svertebrado = Vertebrado1.getValue();

        return svertebrado;
    }

    public String getVertebrado2(String v1,String corre, String vuela) {
        staterBR();
        Vertebrado1.setValue(v1);
        Corre.setValue(corre);
        Vuela.setValue(vuela);
       
        br.forwardChain();
        svertebrado = Vertebrado2.getValue();

        return svertebrado;
    }
    public String getVertebrado2Reptil (String v1, String muda, String capa,
        String colaNada, String cabezapico){
        staterBR();
        Vertebrado1.setValue(v1);
        mudaPiel.setValue(muda);
        caparazon.setValue(capa);
        colaNadar.setValue(colaNada);
        cabezaPico.setValue(cabezapico);
        
        br.forwardChain();
        svertebrado = Vertebrado2.getValue();
        return svertebrado;
    }
    
    public String getV3(String v2, String cp, String vn, String ta, String top, String lb){
        staterBR();
        Vertebrado2.setValue(v2);
        patas.setValue(cp);
        veneno.setValue(vn);
        trepaArbol.setValue(ta);
        tercOjoPar.setValue(top);
        lenguaBifi.setValue(lb);
        
        br.forwardChain();
        svertebrado = Verte3.getValue();
        return svertebrado;
    }
    
    public String getV3Testu(String v2, String co,String te,String am, String aem){
        staterBR();
        Vertebrado2.setValue(v2);
        caparazonOseo.setValue(co);
        terrestre.setValue(te);
        amniota.setValue(am);
        alimentacionMedusa.setValue(aem);
        
        br.forwardChain();
        svertebrado = Verte3.getValue();
        return svertebrado;
    }
    
    public String getV4Ela(String v3, String ha, String va, String pcba, String ca){
        staterBR();
        Verte3.setValue(v3);
        habitatAcuatico.setValue(ha);
        velociadAgresiva.setValue(va);
        patronColor.setValue(pcba);
        cabezaAncha.setValue(ca);
        
        br.forwardChain();
        svertebrado = Verte4.getValue();
        return svertebrado;
    }
    
    public String getV4Angui(String v3,String ar, String cl, String di, String ega){
        staterBR();
        Verte3.setValue(v3);
        arboricola.setValue(ar);
        coloracionLlamativa.setValue(cl);
        diurnos.setValue(di);
        escamasGrandesAcorazadas.setValue(ega);
        
        br.forwardChain();
        svertebrado = Verte4.getValue();
        return svertebrado;
    }
    
    public String getV4Igua(String v3, String ha, String cn){
        staterBR();
        Verte3.setValue(v3);
        habitatArboreo.setValue(ha);
        capacidadNadar.setValue(cn);
        
        br.forwardChain();
        svertebrado = Verte4.getValue();
        return svertebrado;
    }
    
    public String getV4Testu(String v3, String he, String cbc, String gt){
        staterBR();
        Verte3.setValue(v3);
        herbivora.setValue(he);
        caparazonBordesCerrados.setValue(cbc);
        granTamano.setValue(gt);
        
        br.forwardChain();
        svertebrado = Verte4.getValue();
        return svertebrado;
    }
    
    public String get5Abro(String v4, String eo, String bn, String mo, String cm40){
        staterBR();
        Verte4.setValue(v4);
        endemicaOaxaca.setValue(eo);
        bosqueNuboso.setValue(bn);
        marcasOscuras.setValue(mo);
        mayor40.setValue(cm40);
        
        br.forwardChain();
        svertebrado = Verte5.getValue();
        return svertebrado;
    }
    
    public String getV5Micru(String v4, String cao, String am, String zmt, String em){
        staterBR();
        Verte4.setValue(v4);
        cuelloAnchoOscuro.setValue(cao);
        anillosMedianos.setValue(am);
        zonaMontanosa.setValue(zmt);
        endemicaMexico.setValue(em);
        
        br.forwardChain();
        svertebrado = Verte5.getValue();
        return svertebrado;
    }
    
    public String getV5cach(String v4, String fd, String ar, String cl, String mca){
        staterBR();
        Verte4.setValue(v4);
        delgada.setValue(fd);
        arborea.setValue(ar);
        colaLarga.setValue(cl);
        marcasClarasAbdomen.setValue(mca);
        
        br.forwardChain();
        svertebrado = Verte5.getValue();
        return svertebrado;
    }
    
    public void staterBR() {
        //        instancias de variables de regla
        Sangrecaliente = new RuleVariable(br, "Sangrecaliente");
        Plumas = new RuleVariable(br, "Plumas");
        Metamorfosis = new RuleVariable(br, "Metamorfosis");
        Respiracionbranquial = new RuleVariable(br, "Respiracionbranquial");
        
        Corre= new RuleVariable(br, "Corre");
        Vuela= new RuleVariable(br, "Vuela");
        
        Vertebrado1 = new RuleVariable(br, "Vertebrado1");
        Vertebrado2 = new RuleVariable(br, "Vertebrado2");
        Verte3 = new RuleVariable(br, "Vertebrado3");
        Verte4 = new RuleVariable(br, "Vertebrado4");
        Verte5 = new RuleVariable(br, "Vertebrado5");
        
        mudaPiel = new RuleVariable(br, "muda piel");
        caparazon = new RuleVariable(br, "caparazon");
        colaNadar = new RuleVariable(br, "cola para nadar");
        cabezaPico = new RuleVariable(br, "cabeza de pico");
        
        patas = new RuleVariable(br, "Cuerpo con patas");
        veneno = new RuleVariable(br, "veneno");
        trepaArbol = new RuleVariable(br, "Trepa arboles");
        tercOjoPar = new RuleVariable(br, "Tercer ojo parietal");
        lenguaBifi = new RuleVariable(br, "Lengua bifida");
        
        arboricola = new RuleVariable(br, "Arboricolas");
        coloracionLlamativa = new RuleVariable(br, "Coloracion llamativa");
        diurnos = new RuleVariable(br, "Diurnos");
        escamasGrandesAcorazadas = new RuleVariable(br, "Escamas grandes acorazadas");
        
        endemicaOaxaca = new RuleVariable(br,"Endemica de Oaxaca");
        bosqueNuboso = new RuleVariable(br,"Habita en bosques nubosos");
        marcasOscuras = new RuleVariable(br,"Marcas oscuras");
        mayor40 = new RuleVariable(br,"Tamaño > 40cm");
        
        habitatAcuatico = new RuleVariable(br, "Habitat acuatico");
        velociadAgresiva = new RuleVariable(br, "Velocidad agresiva");
        patronColor = new RuleVariable(br, "Patron de colores en las bandas alternas");
        cabezaAncha = new RuleVariable(br, "Cabeza triangular ancha");
    
        habitatArboreo = new RuleVariable(br, "Habitat arboreo");
        capacidadNadar = new RuleVariable(br, "Capacidad de nadar");
        
        cuelloAnchoOscuro = new RuleVariable(br, "Cuello ancho y oscuro");
        anillosMedianos = new RuleVariable(br, "Anillos medianos");
        zonaMontanosa = new RuleVariable(br, "Zonas montanosas y templadas");
        endemicaMexico = new RuleVariable(br, "Endemica de Mexico");
    
        delgada = new RuleVariable(br, "Forma delgada");
        arborea = new RuleVariable(br, "Arboreo");
        colaLarga = new RuleVariable(br, "Cola larga");
        marcasClarasAbdomen = new RuleVariable(br, "Marcas claras en el abdomen");
        
        caparazonOseo = new RuleVariable(br, "Caparazon oseo");
        terrestre = new RuleVariable(br, "Terrestre");
        amniota = new RuleVariable(br, "Amniota");
        alimentacionMedusa = new RuleVariable(br, "Alimentación especializada en medusas");
    
        herbivora = new RuleVariable(br, "Herbivora");
        caparazonBordesCerrados = new RuleVariable(br, "Caparazon con bordes cerrados");
        granTamano = new RuleVariable(br, "Gran tamano");
        
        //        definicion de operadores logicos (condicionales)
        Condition igual = new Condition("=");

        //        creacion de reglas de validacion (Base de Reglas)
        // VERTEBRADOS 1   
        Rule ave = new Rule(br, "AVE",
                new Clause[]{new Clause(Sangrecaliente, igual, "si"),
                    new Clause(Plumas, igual, "si"),
                    new Clause(Respiracionbranquial, igual, "no"),
                    new Clause(Metamorfosis, igual, "no")},
                new Clause(Vertebrado1, igual, "AVE"));
        Rule mamifero = new Rule(br, "MAMIFERO",
                new Clause[]{new Clause(Sangrecaliente, igual, "si"), 
                    new Clause(Plumas, igual, "no"), 
                    new Clause(Respiracionbranquial, igual, "no"), 
                    new Clause(Metamorfosis, igual, "no")},
                new Clause(Vertebrado1, igual, "MAMIFERO"));
        Rule reptil = new Rule(br, "REPTIL",
                new Clause[]{new Clause(Sangrecaliente, igual, "no"), 
                    new Clause(Plumas, igual, "no"), 
                    new Clause(Respiracionbranquial, igual, "no"), 
                    new Clause(Metamorfosis, igual, "no")},
                new Clause(Vertebrado1, igual, "REPTIL"));
        Rule pez = new Rule(br, "PEZ",
                new Clause[]{new Clause(Sangrecaliente, igual, "no"), 
                    new Clause(Plumas, igual, "no"), 
                    new Clause(Respiracionbranquial, igual, "si"), 
                    new Clause(Metamorfosis, igual, "no")},
                new Clause(Vertebrado1, igual, "PEZ"));
        Rule anfibio = new Rule(br, "ANFIBIO",
                new Clause[]{new Clause(Sangrecaliente, igual, "no"), 
                    new Clause(Plumas, igual, "no"), 
                    new Clause(Respiracionbranquial, igual, "no"), 
                    new Clause(Metamorfosis, igual, "si")},
                new Clause(Vertebrado1, igual, "ANFIBIO"));
        
         // VERTEBRADOS 2 (AVES)
         Rule paleognathae = new Rule(br, "PALEOGNATHAE",
                new Clause[]{new Clause(Vertebrado1, igual, "AVE"),
                    new Clause(Corre, igual, "si"),
                    new Clause(Vuela, igual, "no")},
                new Clause(Vertebrado2, igual, "PALEOGNATHAE"));
        Rule neognathae = new Rule(br, "NEOGNATHAE",
                new Clause[]{new Clause(Vertebrado1, igual, "AVE"),
                    new Clause(Corre, igual, "si"),
                    new Clause(Vuela, igual, "si")},
                new Clause(Vertebrado2, igual, "NEOGNATHAE"));
        
        //VERTEBRADOS 2 (REPTILES)
        Rule squamata = new Rule(br, "SQUAMATA",
            new Clause[]{new Clause(Vertebrado1, igual,"REPTIL"),
                new Clause(mudaPiel, igual, "si"),
                new Clause(caparazon, igual, "no"),
                new Clause(colaNadar, igual, "no"),
                new Clause(cabezaPico, igual, "no")},
            new Clause(Vertebrado2, igual,"SQUAMATA"));
        Rule quelonia = new Rule(br, "QUELONIA",
            new Clause[]{new Clause(Vertebrado1, igual,"REPTIL"),
                new Clause(mudaPiel, igual, "no"),
                new Clause(caparazon, igual, "si"),
                new Clause(colaNadar, igual, "no"),
                new Clause(cabezaPico, igual, "no")},
            new Clause(Vertebrado2, igual,"QUELONIA"));
        Rule cocodrilia = new Rule(br, "COCODRILIA",
            new Clause[]{new Clause(Vertebrado1, igual,"REPTIL"),
                new Clause(mudaPiel, igual, "no"),
                new Clause(caparazon, igual, "no"),
                new Clause(colaNadar, igual, "si"),
                new Clause(cabezaPico, igual, "no")},
            new Clause(Vertebrado2, igual,"COCODRILIA"));
        Rule rhynchocephalia = new Rule(br, "RHYNCHOCEPHALIA",
            new Clause[]{new Clause(Vertebrado1, igual,"REPTIL"),
                new Clause(mudaPiel, igual, "no"),
                new Clause(caparazon, igual, "no"),
                new Clause(colaNadar, igual, "no"),
                new Clause(cabezaPico, igual, "si")},
            new Clause(Vertebrado2, igual,"RHYNCHOCEPHALIA"));
        
        //VERTEBRADOS 3 (SQUAMATA)
        Rule elapidae = new Rule(br, "ELAPIDAE",
            new Clause[]{
                new Clause(patas, igual, "no"),
                new Clause(veneno, igual, "si"),
                new Clause(trepaArbol, igual, "si"),
                new Clause(tercOjoPar, igual, "no"),
                new Clause(lenguaBifi, igual, "no")},
            new Clause(Verte3, igual,"ELAPIDAE"));
        Rule agamidae = new Rule(br, "AGAMIDAE",
            new Clause[]{
                new Clause(patas, igual, "si"),
                new Clause(veneno, igual, "no"),
                new Clause(trepaArbol, igual, "si"),
                new Clause(tercOjoPar, igual, "no"),
                new Clause(lenguaBifi, igual, "no")},
            new Clause(Verte3, igual,"AGAMIDAE"));
        Rule anguidae = new Rule(br, "ANGUIDAE",
            new Clause[]{
                new Clause(patas, igual, "no"),
                new Clause(veneno, igual, "no"),
                new Clause(trepaArbol, igual, "no"),
                new Clause(tercOjoPar, igual, "no"),
                new Clause(lenguaBifi, igual, "no")},
            new Clause(Verte3, igual,"ANGUIDAE"));
        Rule iguanidae = new Rule(br, "IGUANIDAE",
            new Clause[]{
                new Clause(patas, igual, "si"),
                new Clause(veneno, igual, "no"),
                new Clause(trepaArbol, igual, "si"),
                new Clause(tercOjoPar, igual, "si"),
                new Clause(lenguaBifi, igual, "no")},
            new Clause(Verte3, igual,"IGUANIDAE"));
        Rule varanidae = new Rule(br, "VARANIDAE",
            new Clause[]{
                new Clause(patas, igual, "si"),
                new Clause(veneno, igual, "no"),
                new Clause(trepaArbol, igual, "si"),
                new Clause(tercOjoPar, igual, "no"),
                new Clause(lenguaBifi, igual, "si")},
            new Clause(Verte3, igual,"VARANIDAE"));
        Rule calubridae = new Rule(br, "COLUBRIDAE",
            new Clause[]{
                new Clause(patas, igual, "no"),
                new Clause(veneno, igual, "no"),
                new Clause(trepaArbol, igual, "si"),
                new Clause(tercOjoPar, igual, "no"),
                new Clause(lenguaBifi, igual, "no")},
            new Clause(Verte3, igual,"COLUBRIDAE"));
        
        //Vertebrados 3 (Testudines)
        Rule testudinidae = new Rule(br, "TESTUDINIDAE",
            new Clause[]{
                new Clause(caparazonOseo, igual, "si"),
                new Clause(terrestre,igual,"si"),
                new Clause(amniota,igual,"si"),
                new Clause(alimentacionMedusa,igual,"no")},
            new Clause(Verte3, igual, "TESTUDINIDAE"));
        Rule cheloniidae = new Rule(br, "CHELONIIDAE",
            new Clause[]{
                new Clause(caparazonOseo, igual, "si"),
                new Clause(terrestre,igual,"no"),
                new Clause(amniota,igual,"si"),
                new Clause(alimentacionMedusa,igual,"no")},
            new Clause(Verte3, igual, "CHELONIIDAE"));
        Rule dermochelyidae = new Rule(br, "DERMOCHELYIDAE",
            new Clause[]{
                new Clause(caparazonOseo, igual, "si"),
                new Clause(terrestre,igual,"no"),
                new Clause(amniota,igual,"si"),
                new Clause(alimentacionMedusa,igual,"si")},
            new Clause(Verte3, igual, "DERMOCHELYIDAE"));
        Rule codylidae = new Rule(br, "CODYLIDAE",
            new Clause[]{
                new Clause(caparazonOseo, igual, "no"),
                new Clause(terrestre,igual,"no"),
                new Clause(amniota,igual,"si"),
                new Clause(alimentacionMedusa,igual,"no")},
            new Clause(Verte3, igual, "CODYLIDAE"));
        
        //Vertebrados 4(Elapidae)
        Rule micruroides = new Rule(br,"MICRUROIDES",
            new Clause[]{
                new Clause(habitatAcuatico, igual, "no"),
                new Clause(velociadAgresiva, igual, "no"),
                new Clause(patronColor,igual,"si"),
                new Clause(cabezaAncha, igual, "no")},
            new Clause(Verte4, igual, "MICRUROIDES"));
        Rule acantrophis = new Rule(br,"ACANTROPHIS",
            new Clause[]{
                new Clause(habitatAcuatico, igual, "no"),
                new Clause(velociadAgresiva, igual, "si"),
                new Clause(patronColor,igual,"no"),
                new Clause(cabezaAncha, igual, "si")},
            new Clause(Verte4, igual, "ACANTROPHIS"));
        Rule hydrophis = new Rule(br,"HYDROPHIS",
            new Clause[]{
                new Clause(habitatAcuatico, igual, "si"),
                new Clause(velociadAgresiva, igual, "no"),
                new Clause(patronColor,igual,"no"),
                new Clause(cabezaAncha, igual, "no")},
            new Clause(Verte4, igual, "HYDROPHIS"));
        Rule micrurus = new Rule(br,"MICRURUS",
            new Clause[]{
                new Clause(habitatAcuatico, igual, "no"),
                new Clause(velociadAgresiva, igual, "no"),
                new Clause(patronColor,igual,"no"),
                new Clause(cabezaAncha, igual, "no")},
            new Clause(Verte4, igual, "MICRURUS"));
        Rule dendroaspis = new Rule(br,"DENDROASPIS",
            new Clause[]{
                new Clause(habitatAcuatico, igual, "no"),
                new Clause(velociadAgresiva, igual, "si"),
                new Clause(patronColor,igual,"no"),
                new Clause(cabezaAncha, igual, "no")},
            new Clause(Verte4, igual, "DENDROASPIS"));
        
        //Vertebrados 4 (Anguidae)
        Rule abronia = new Rule(br,"ABRONIA",
            new Clause[]{
                new Clause(arboricola, igual, "si"),
                new Clause(coloracionLlamativa, igual, "si"),
                new Clause(diurnos, igual, "si"),
                new Clause(escamasGrandesAcorazadas, igual, "si")},
            new Clause(Verte4, igual,"ABRONIA"));
        Rule barisia = new Rule(br,"BARISIA",
            new Clause[]{
                new Clause(arboricola, igual, "si"),
                new Clause(coloracionLlamativa, igual, "no"),
                new Clause(diurnos, igual, "no"),
                new Clause(escamasGrandesAcorazadas, igual, "si")},
            new Clause(Verte4, igual,"BARISIA"));
        Rule desertum = new Rule(br,"DESERTUM",
            new Clause[]{
                new Clause(arboricola, igual, "no"),
                new Clause(coloracionLlamativa, igual, "no"),
                new Clause(diurnos, igual, "no"),
                new Clause(escamasGrandesAcorazadas, igual, "no")},
            new Clause(Verte4, igual,"DESERTUM"));
        Rule elgaria = new Rule(br,"ELGARIA",
            new Clause[]{
                new Clause(arboricola, igual, "no"),
                new Clause(coloracionLlamativa, igual, "si"),
                new Clause(diurnos, igual, "no"),
                new Clause(escamasGrandesAcorazadas, igual, "si")},
            new Clause(Verte4, igual,"ELGARIA"));
        Rule ophisaurus = new Rule(br,"OPHISAURUS",
            new Clause[]{
                new Clause(arboricola, igual, "no"),
                new Clause(coloracionLlamativa, igual, "no"),
                new Clause(diurnos, igual, "si"),
                new Clause(escamasGrandesAcorazadas, igual, "no")},
            new Clause(Verte4, igual,"OPHISAURUS"));
        
        //Vertebrado 4 (iguanidae)
        Rule cachyx = new Rule(br, "CACHRYX",
            new Clause[]{
                new Clause(habitatArboreo,igual,"si"),
                new Clause(capacidadNadar,igual,"no")},
            new Clause(Verte4, igual, "CACHRYX"));
        Rule iguana = new Rule(br, "IGUANA",
            new Clause[]{
                new Clause(habitatArboreo,igual,"si"),
                new Clause(capacidadNadar,igual,"si")},
            new Clause(Verte4, igual, "IGUANA"));
        Rule amblyrhynchus = new Rule(br, "AMBLYRHYNCHUS",
            new Clause[]{
                new Clause(habitatArboreo,igual,"no"),
                new Clause(capacidadNadar,igual,"no")},
            new Clause(Verte4, igual, "AMBLYRHYNCHUS"));
        Rule cyclura = new Rule(br, "CYCLURA",
            new Clause[]{
                new Clause(habitatArboreo,igual,"no"),
                new Clause(capacidadNadar,igual,"si")},
            new Clause(Verte4, igual, "CYCLURA"));
        
        //Vertebrado 4 (Testudinidae)
        Rule chelonia = new Rule(br, "CHELONIA",
            new Clause[]{
                new Clause(herbivora,igual,"si"),
                new Clause(caparazonBordesCerrados,igual,"no"),
                new Clause(granTamano,igual,"si")},
            new Clause(Verte4, igual, "CHELONIA"));
        Rule caretta = new Rule(br, "CARETTA",
            new Clause[]{
                new Clause(herbivora,igual,"no"),
                new Clause(caparazonBordesCerrados,igual,"no"),
                new Clause(granTamano,igual,"si")},
            new Clause(Verte4, igual, "CARETTA"));
        Rule eretmochelys = new Rule(br, "ERETMOCHELYS",
            new Clause[]{
                new Clause(herbivora,igual,"no"),
                new Clause(caparazonBordesCerrados,igual,"si"),
                new Clause(granTamano,igual,"si")},
            new Clause(Verte4, igual, "ERETMOCHELYS"));
        Rule lepidochelys = new Rule(br, "LEPIDOCHELIS",
            new Clause[]{
                new Clause(herbivora,igual,"no"),
                new Clause(caparazonBordesCerrados,igual,"no"),
                new Clause(granTamano,igual,"no")},
            new Clause(Verte4, igual, "LEPIDOCHELIS"));
        
        //Vertebrado 5 (Micrurus)
        Rule diastema = new Rule(br, "MICRURUS DIASTEMA",
            new Clause[]{
                new Clause(cuelloAnchoOscuro,igual,"no"),
                new Clause(anillosMedianos, igual, "si"),
                new Clause(zonaMontanosa, igual, "no"),
                new Clause(endemicaMexico,igual,"no")},
            new Clause(Verte5, igual, "MICRURUS DIASTEMA"));
        Rule mbogerti = new Rule(br, "MICRURUS BOGERTI",
            new Clause[]{
                new Clause(cuelloAnchoOscuro,igual,"no"),
                new Clause(anillosMedianos, igual, "si"),
                new Clause(zonaMontanosa, igual, "no"),
                new Clause(endemicaMexico,igual,"si")},
            new Clause(Verte5, igual, "MICRURUS BOGERTI"));
        Rule laticollaris = new Rule(br, "MICRURUS LATICOLLARIS",
            new Clause[]{
                new Clause(cuelloAnchoOscuro,igual,"si"),
                new Clause(anillosMedianos, igual, "no"),
                new Clause(zonaMontanosa, igual, "si"),
                new Clause(endemicaMexico,igual,"si")},
            new Clause(Verte5, igual, "MICRURUS LATICOLLARIS"));
        Rule apiatus = new Rule(br, "MICRURUS APIATUS",
            new Clause[]{
                new Clause(cuelloAnchoOscuro,igual,"no"),
                new Clause(anillosMedianos, igual, "no"),
                new Clause(zonaMontanosa, igual, "no"),
                new Clause(endemicaMexico,igual,"si")},
            new Clause(Verte5, igual, "MICRURUS APIATUS"));
        Rule microacanensis = new Rule(br, "MICRURUS MICROACANENSIS",
            new Clause[]{
                new Clause(cuelloAnchoOscuro,igual,"no"),
                new Clause(anillosMedianos, igual, "si"),
                new Clause(zonaMontanosa, igual, "si"),
                new Clause(endemicaMexico,igual,"si")},
            new Clause(Verte5, igual, "MICRURUS MICROACANENSIS"));
        
        //Vertebrado 5 (Abronia)
        Rule bogerti = new Rule(br,"ABRONIA BOGERTI",
                new Clause[]{
                    new Clause(endemicaOaxaca, igual,"no"),
                    new Clause(bosqueNuboso, igual,"si"),
                    new Clause(marcasOscuras, igual,"no"),
                    new Clause(mayor40, igual,"si")},
                new Clause(Verte5,igual,"ABRONIA BOGERTI")
        );
        Rule cuetzpali = new Rule(br,"ABRONIA CUETZPALI",
                new Clause[]{
                    new Clause(endemicaOaxaca, igual,"si"),
                    new Clause(bosqueNuboso, igual,"si"),
                    new Clause(marcasOscuras, igual,"si"),
                    new Clause(mayor40, igual,"no")},
                new Clause(Verte5,igual,"ABRONIA CUETZPALI")
        );
        Rule graminea = new Rule(br,"ABRONIA GRAMINEA",
                new Clause[]{
                    new Clause(endemicaOaxaca, igual,"no"),
                    new Clause(bosqueNuboso, igual,"si"),
                    new Clause(marcasOscuras, igual,"si"),
                    new Clause(mayor40, igual,"si")},
                new Clause(Verte5,igual,"ABRONIA GRAMINEA")
        );
        Rule mixteca = new Rule(br,"ABRONIA MIXTECA",
                new Clause[]{
                    new Clause(endemicaOaxaca, igual,"si"),
                    new Clause(bosqueNuboso, igual,"no"),
                    new Clause(marcasOscuras, igual,"si"),
                    new Clause(mayor40, igual,"no")},
                new Clause(Verte5,igual,"ABRONIA MIXTECA")
        );
        Rule oaxacae = new Rule(br,"ABRONIA OAXACAE",
                new Clause[]{
                    new Clause(endemicaOaxaca, igual,"si"),
                    new Clause(bosqueNuboso, igual,"si"),
                    new Clause(marcasOscuras, igual,"no"),
                    new Clause(mayor40, igual,"no")},
                new Clause(Verte5,igual,"ABRONIA OAXACAE")
        );
        
        //Vertebrado 5 (cachryx)
        Rule quinquecarinata = new Rule(br, "CACHRYX QUINQUECARINATA",
            new Clause[]{
                new Clause(delgada,igual,"no"),
                new Clause(arborea,igual,"no"),
                new Clause(colaLarga,igual,"no"),
                new Clause(marcasClarasAbdomen,igual,"si")},
            new Clause(Verte5, igual, "CACHRYX QUINQUECARINATA"));
        Rule defensor = new Rule(br, "CACHRYX DEFENSOR",
            new Clause[]{
                new Clause(delgada,igual,"si"),
                new Clause(arborea,igual,"si"),
                new Clause(colaLarga,igual,"si"),
                new Clause(marcasClarasAbdomen,igual,"no")},
            new Clause(Verte5, igual, "CACHRYX DEFENSOR"));
        Rule simils = new Rule(br, "CACHRYX SIMILIS",
            new Clause[]{
                new Clause(delgada,igual,"si"),
                new Clause(arborea,igual,"no"),
                new Clause(colaLarga,igual,"no"),
                new Clause(marcasClarasAbdomen,igual,"no")},
            new Clause(Verte5, igual, "CACHRYX SIMILIS"));
        Rule Pectinata = new Rule(br, "CACHRYX PECTINATA",
            new Clause[]{
                new Clause(delgada,igual,"si"),
                new Clause(arborea,igual,"si"),
                new Clause(colaLarga,igual,"si"),
                new Clause(marcasClarasAbdomen,igual,"si")},
            new Clause(Verte5, igual, "CACHRYX PECTINATA"));
        Rule alfredschmidti = new Rule(br, "CACHRYX ALFREDSCHMIDTI",
            new Clause[]{
                new Clause(delgada,igual,"no"),
                new Clause(arborea,igual,"no"),
                new Clause(colaLarga,igual,"no"),
                new Clause(marcasClarasAbdomen,igual,"no")},
            new Clause(Verte5, igual, "CACHRYX ALFREDSCHMIDTI"));
        
    }
}
