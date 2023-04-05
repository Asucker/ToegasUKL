package com.example.uklrecycle

object StoreData {
    private val data = arrayOf(
        arrayOf(
            "Meth chocolate",
            "Hmmmm yes funni chocolate to bring to Poland." ,
            "https://www.skeptic.org.uk/wp-content/uploads/2022/11/Panzerschokolade.png"
        ),
        arrayOf(
            "MP40",
            "The MP 40 (Maschinenpistole 40) is a submachine gun chambered for the 9×19mm Parabellum cartridge. It was developed in Nazi Germany and used extensively by the Axis powers during World War II..",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/MP_40_AYF_2.JPG/300px-MP_40_AYF_2.JPG"
        ),
        arrayOf(
            "Stahlhelm",
            "The Stahlhelm ('steel helmet') is a German military steel combat helmet intended to provide protection against shrapnel and fragments of grenades. The term Stahlhelm refers both to a generic steel helmet and more specifically to the distinctive German military design..",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Duitse_militaire_Stahlhelm_M.35%2C_grijsgroen_met_rijkswapen%2C_leren_binnenhelm_en_kinriem_met_gesp_050551.JPG/1280px-Duitse_militaire_Stahlhelm_M.35%2C_grijsgroen_met_rijkswapen%2C_leren_binnenhelm_en_kinriem_met_gesp_050551.JPG"
        ),
        arrayOf(
            "MP 34",
            "The MP34 (Maschinenpistole 34, literally \"Machine Pistol 34\") is a submachine gun (SMG) that was manufactured by Waffenfabrik Steyr as Steyr-Solothurn S1-100 and used by the Austrian Army and Austrian Gendarmerie and subsequently by units of the German Army and the Waffen SS, in World War II. An exceptionally well-made weapon, it was used by some forces well into the 1970s..",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/1673_-_Salzburg_-_Festung_Hohensalzburg_-_Österreichisch_Maschinenpistole_M34_noBG.png/300px-1673_-_Salzburg_-_Festung_Hohensalzburg_-_Österreichisch_Maschinenpistole_M34_noBG.png"
        ),
        arrayOf(
            "Panzer IV",
            "The Panzerkampfwagen IV (Pz.Kpfw. IV), commonly known as the Panzer IV, was a German medium tank developed in the late 1930s and used extensively during the Second World War. Its ordnance inventory designation was Sd.Kfz. 161..",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Panzermuseum_Munster_2010_0128.JPG/300px-Panzermuseum_Munster_2010_0128.JPG"
        ),
        arrayOf(
            "Tiger II",
            "The Tiger II is a German heavy tank of the Second World War. The final official German designation was Panzerkampfwagen Tiger Ausf. B,[notes 1] often shortened to Tiger B.[8] The ordnance inventory designation was Sd.Kfz. 182.[8] (Sd.Kfz. 267 and 268 for command vehicles). It was also known informally as the Königstiger[8] (German for Bengal tiger and also, literally, \"King Tiger\").[9][10] Contemporaneous Allied soldiers usually called it the King Tiger or Royal Tiger.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Bundesarchiv_Bild_101I-680-8282A-06%2C_Budapest%2C_Panzer_VI_%28Tiger_II%2C_Königstiger%29.jpg/300px-Bundesarchiv_Bild_101I-680-8282A-06%2C_Budapest%2C_Panzer_VI_%28Tiger_II%2C_Königstiger%29.jpg"
        ),
        arrayOf(
            "Nijika",
            "She is real She is real She is real She is real She is real She is real She is real She is real She is real She is real She is real ",
            "https://cdn.realsport101.com/images/ncavvykf/epicstream/f29610efb8d2a0641d192496fbd25636b27960fd-1280x720.jpg?rect=0,0,1279,720&w=700&h=394&dpr=2"
        )
    )


    val listData: ArrayList<Store>
        get() {
            val list = arrayListOf<Store>()
            for (aData in data) {
                val store = Store()
                store.name = aData[0]
                store.from = aData[1]
                store.photo = aData[2]


                list.add(store)
            }


            return list
        }
}