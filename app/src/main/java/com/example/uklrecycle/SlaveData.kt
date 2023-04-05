package com.example.uklrecycle

object SlaveData {
    private val data = arrayOf(
    arrayOf(
        "Dumb ones",
        "Can't do anything for hard labour only" ,
        "https://www.unicef.org/sites/default/files/styles/hero_desktop/public/CAR%20PR%2012%2005.jpg?itok=S6gOP35R"
    ),
    arrayOf(
        "Adult African",
        "More mature and a bit smarter",
        "https://images.unsplash.com/photo-1612214095364-c92c983ced91?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGFmcmljYW4lMjBtYW58ZW58MHx8MHx8&w=1000&q=80"
    ),
    arrayOf(
        "African child soldier",
        "dumb ones + guns= meat grinder.",
        "https://legionmagazine.com/en/wp-content/uploads/2017/03/child-soldier-Buzz-Kenya.jpg"
    ),
    arrayOf(
        "Javanese kuli",
        "Will build your building the fastest.",
        "https://media.istockphoto.com/id/1014984526/photo/senior-indonesian-farmer-smiling-portrait-in-hut.jpg?s=612x612&w=0&k=20&c=Ie08BJACMBMU3Hl0bRvOVPeYB_9Nq7kH7CmEh3aNxVY="
    ),
        arrayOf(
            "Jew",
            "Disgusting sub human filth",
            "https://cdn.theatlantic.com/media/img/photo/2011/10/world-war-ii-the-holocaust/w01_2001356_-1/original.jpg"
    )
)


val listData: ArrayList<Slave>
    get() {
        val list = arrayListOf<Slave>()
        for (aData in data) {
            val slave = Slave()
            slave.name = aData[0]
            slave.from = aData[1]
            slave.photo = aData[2]


            list.add(slave)
        }


        return list
    }
}