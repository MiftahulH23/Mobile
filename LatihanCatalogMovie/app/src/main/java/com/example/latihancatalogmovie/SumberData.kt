package com.example.latihancatalogmovie

class SumberData {
    companion object {
        fun buatSetData(): ArrayList<ListObjMovie> {
            val list = ArrayList<ListObjMovie>()
            list.add(
                ListObjMovie(
                    "The Engineer",
                    "Follows the biggest manhunt in the history of Israel to find Yahya Ayyash, " +
                            "the mastermind bombmaker who oversaw a group of suicide troops in Israel in the middle of the 1990s.",
                    "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJQMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAAABgUHAQMECP/EACwQAAIBAwMDBAIABwAAAAAAAAECAwAEEQUSIRMxQQYiUWEUcQcjMlKBofD/xAAZAQADAQEBAAAAAAAAAAAAAAACAwQBBQD/xAAfEQACAgICAwEAAAAAAAAAAAAAAQIRAxIhMRNRgQT/2gAMAwEAAhEDEQA/AK7gvLna9681091K+0ndhpe/KsD4po0v1jqtqIUvzLc2TEoWcYljx5J898c9/mo+H01NeadaXCPAGVcojbh+jznmu7S/Tl7Np8zySrHMchnY7gxzwP8Avr91BLJBnQWOSLS0rTdP1u0gv4puvA6+1ux+wf1TDDp9vAgWONQo8Dtn5pc/h/p82i+m7eG6bMspMx25wN3IHPnGM/dMfW+WP6okooU3JnQFT4orlaQeT/qii3QOrK40MQ6hadMEbCAvHdSKLKOd72TTbW5MzSNsxJ7kTHLHjzjwCBkVAelr4xXJs7qdrS5ZTHsx3Pggnv5pu0nRbhNM1G7LvIw/lIpRpSfchZtoYkjA7A85PapVjuVFs5rWxp1MP0IQpkjZZo+UJXgnGMjv+qjfSd5dXt/NHeTq0i2iOI/yCxGXcEhcDPZfd47eagLi31WC5uwbS9liJuPxiqSDG6RmUjHbALYB8cea1hdX690lxDdOgFx0WktZJQdzRsMYxjALj7CkDvVWqRMp8NFitbnPuopZ9KQaos2pvJBMiPcuYgysgK73wQD9cY+AtYpb76M+ld6lrEWoeorVxEsiNvRIpFHPgHBHGScD65qwvSfqS10eyltdWcW1vHloC3ByTygA78nj/NU4kkb30HWK9OQKGcjBGDgHI54zTVp1rNezdWSWN0hOxJrkgEY+PjP1++9MdY6Pc5LHq/vtQ9T34sdO6cHRIlyfd0cHhmIyC3wOwP8AdjIbpJ5bWOBZEeZjhHkjTz2yR4HnzikrTITaXEMenfkR2Ns3Vknchi7nGdxAAJ52/QAx2p3e4x2cZoVNc2+TJQo7o+VrNRS30p3BCDtOD+6Kas8BfikeZNIhuL25twFzGvdiPaozVl2j9JY2hkCXCEuHAz7sY7UUUjO7kV/nVQv2SmoXtzO5SJJhvhycIzKHwfaT5PHI8ZFarm7vGW3H5FsR/RtztCYyck7snkDPnvWKKCjE7Naa8bSGDfJ1pZIleQrIeCc8cGiiimrGgNj/2Q==",
                    "3.8/10",
                    "Petualangan",
                    "1 jam 32 menit",
                    "Inggris",
                    "Emile Hirisch"
                )
            )
            list.add(
                ListObjMovie(
                    "\n" +
                            "Inside Man",
                    "Based on true events, Inside Man follows disgraced New York Police Detective Bobby Belucci (Emile Hirsch) as his life falls apart when he discovers his wife (Ashley Greene) is having an affair. After beating her lover to a pulp, she leaves him and Bobby gets demoted at work, triggering his determination to prove he's worthy of redemption." +
                            " His plan is to go undercover as a grunt and infiltrate the Gambino crime family's notorious \"DeMeo Crew,\" a violent and bloody faction that reigned terror in the 1960s and '70s. Bobby will stop at nothing to get close to the head of the crew, Roy DeMeo (Danny Abeckaser), to expose the murder and corruption. But as Bobby sinks deeper into the mob and more bodies drop, the price for absolution may be higher than he can afford.",
                    "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJQMBIgACEQEDEQH/xAAaAAADAAMBAAAAAAAAAAAAAAAABQYDBAcB/8QAMhAAAgEDAwMBBgMJAAAAAAAAAQIDBAURABIhBhMxQRQiUWFxoQcygRUjM0JSkbHB4f/EABkBAAIDAQAAAAAAAAAAAAAAAAIDAQQFAP/EACERAAICAgIBBQAAAAAAAAAAAAECABESIQMxEwQiQYHw/9oADAMBAAIRAxEAPwCT6O6RS8wTVldMsFHCCWYnz5GPl4OT9NLbtBS2iVoaYDBzgFg6sPrj7c6qek+1Hb39oLcukbxhT/DYkkjAz5H20p6yFNHUxxU0QEfcJUE5b76YxOZENFHhDSIuAVZ1aMYikUFRnO0+o026ftTV86gTyU4JChlGc6Vzh2RkOCmQV48asOkI4p49lRGGk7DiPnHvbSBrmuoKUTUXdY2MWO4xUjSiV2iEvcVNu5W8ZHjOQw4+GjWfqGGV6uA1Um+VaaNW9/eBjxg/TBPzJ0aci+0SpyuA5EYXC4T2vbHbKpu88ZSVkGAVyOOT9+NJbsiyOG7kjycZZmzqi6LPTNRFO/U8qrIalQm6aRP3e05/KR6408pE/D+RkxURBWgjYvPUzhlY7t2VBAJxtzz+mgog9R4ZCgFn99znLUzPEPdAHqcemnFr7VKiyGoKSLjCgeddETpzpkUInqaZhEtNHPLI7VC4QoTuGDj8w/zqe6y6epY5IEsFvmdo4xNUKrSs6xkcMQx4Gd2Dj01I32INqAcCbk1eKh6+taoYKC2OFGAAAB/rRpfXiroquWkqo3jmhbayOMEfX9Ne6eK+JSIYmzNaOaLbtnRkHHldbUNs9oI7FRAQ3gb+f7aq7MrQ1V2gqO2WiqFVuQNqlRjyMeupfqO3X6mnSeCWSaGZiIWhVBIMc8hACPHnQFqF9xviYtXUrXv9+WnNLM1HJTeyJTdho5ChVfXAP5iMAn4DWo34jXn9o+5HQmrKdl5TAy5CsW2n3vjuHjwTpNZbrNRUcyXp5A6xmWmngmRmYj+RwM+fQnGD5+Tekt1ur5aWvp6q3JPOdzQ1FSoBZlLYb+k+8R48jHwyOSGqnY8i3e4mu1wkutzqa6sjRZ5n3OsYIA4+ZJ0ay9Tb4bh2zSojBeSjbw3wOfXRp1gRNE7MoempbZc56sx1MdK71CPF7YEeN1VRwwDA53DIPyGsl+Wut9NDSNd7dLDMxMlXBC5khUn0BODxkYH/AHRo1TXhU2Zv8/rORVC6oyIrbfYKOspjDW1FxpjnvL7KlMRwcbTvY+ceRrBRUdqEClqmpWo2nneqKrY+AVsjPzGvdGmYKJmFyYxvNzjEsKdz2h1iXfJ3ncEnkgbhkDOcD0zo0aNTdQMQdmf/2Q==",
                    "5.5./10",
                    "Drama/Cerita seru ",
                    "1 j 27 m\n",
                    "Inggris",
                    "Lucy Hale"
                )
            )
            list.add(
                ListObjMovie(
                    "Desperation Road",
                    "A Southern Noir thriller, set in a tough-and-tumble Mississippi town where a woman and her young daughter are caught " +
                            "in the crossfire when whiskey, guns, and the desire for revenge violently intersect.",
                    "data:image/jpeg;base64,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",
                    "5.7/10",
                    "Action",
                    "1j 33m",
                    "Inggris",
                    "Mel Gibson"
                )
            )
            list.add(
                ListObjMovie(
                    "Sewu Dino",
                    "Film ini mengisahkan Sri (Mikha Tambayong), seorang perempuan muda yang hidup dengan keterbatasan. Ia hanya tinggal bersama ayahnya yang sakit parah " +
                            "dan butuh biaya pengobatan. Kehidupan sehari-hari Sri dihabiskan dengan bekerja pada Yu Minah (Maryam Supraba)",
                    "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJgMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAAAAgEFAwQGB//EAC4QAAIBAwIEAwcFAAAAAAAAAAECEQADBBIhEzFBUQUiYQYUI3GBkaEyUrHh8P/EABcBAAMBAAAAAAAAAAAAAAAAAAABAgP/xAAaEQEBAQEBAQEAAAAAAAAAAAAAAQIRIUED/9oADAMBAAIRAxEAPwDxsCae2msxqA9TUqs9RTohPKmE+78vip+aW3Z+IQelbK22caY5VlW1okGAes0Q7GBjCzPpRUX9og/appkXGa3bvI921xUVgWtlo1DtNS+h7jFU0qSYWZgdppsJFfI0XFkBSYmJq8wfD/D3KNkWnjUA0OwgTUa1M3q85ulWjl7SqwOx80nYjp/BrLj3rFi45vY4vqVYBdZWCRAO3bnXW4/s/wCz7JqZs5tJH6L4gkjlGiQNvwfpzOdi4SZdwY3G4fEYKrXVPlnbeO0Up+md9h3Fyqrm8fKisTtpYr2MUVozbuNZuMj3rYRhaHn842+nOtxb7Wwl22ratxqI2Py9f6qrt3SmoB3UMIOkxI9aZVx+bs433AbmKjUaYvyOlTGzbtpnx8bIFsrLa5l+sxB6dqPF8bPK2nveGCxoAFwoNIaP3QPufua50HFElOJz2OuK27GTiWXV4v6l3B40/giok5fF6nnpbuIkqeNassyhtLELsfmTNFZbniFlrSC2rKqwACAYAFFaTrOyKJXAEmD6U63Rz0gHpM1NFUg3vBggnblzNIbi9FFFFAIW/wB2ooooD//Z",
                    "8.5/10",
                    "Horor",
                    "2 j 1 m",
                    "Indonesia",
                    "Kimo Stamboel"
                )
            )
            list.add(
                ListObjMovie(
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""
                )
            )
            list.add(
                ListObjMovie(
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""
                )
            )
            list.add(
                ListObjMovie(
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""
                )
            )



            return list
        }
    }
}