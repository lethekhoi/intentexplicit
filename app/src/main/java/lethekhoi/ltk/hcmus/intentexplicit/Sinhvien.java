package lethekhoi.ltk.hcmus.intentexplicit;

import java.io.Serializable;

//implements : đa thừa kế
public class Sinhvien  implements Serializable {
    public String name;
    public String age;

    public Sinhvien(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
