public enum Regions {
    Astrakhan("Астраханская область", 30), Moscow("Московская область",77, 97, 99, 177, 199, 197, 777, 797, 799),
    Volgograd("Волгоградская область",34,134),Peterburg("Ленинградская область",78, 98, 178, 198);

    private  int[] value;
    private  String name;

    Regions(String nam, int ... val ) {
        value = val;
        name = nam;
    }

    public int[] getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
