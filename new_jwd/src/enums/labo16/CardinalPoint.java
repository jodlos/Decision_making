package enums.labo16;

public enum CardinalPoint {
    N("północ", "North", 0),
    E("wschód", "East", 90),
    S("południe", "South", 180),
    W("zachód", "West", 270),

    NE("północny-wschód", "Northeast", 45),
    SE("południowy-wschód", "Southeast", 135),
    SW("południowy-zachód", "Southwest", 225),
    NW("północny-zachód", "Northwest", 315);

    String namePL;
    String nameEn;
    int rotation;

    CardinalPoint(String namePL, String nameEn, int rotation) {
        this.namePL = namePL;
        this.nameEn = nameEn;
        this.rotation = rotation;
    }

    public String getNamePL() {
        return namePL;
    }

    public String getNameEn() {
        return nameEn;
    }

    public int getRotation() {
        return rotation;
    }

    @Override
    public String toString() {
        return "CardinalPoint{" +
                "namePL='" + namePL + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", rotation=" + rotation +
                '}';
    }
}
