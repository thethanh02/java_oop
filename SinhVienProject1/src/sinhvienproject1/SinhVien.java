import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SinhVien{
    private String name, id, msv;
    private Date dob;
    private Double diem;

    public SinhVien(String name, String msv, String dob, Double diem) throws ParseException   {
        this.name = name;
        this.id = "B20DCCN001";
        this.msv = msv;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.diem = diem;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + msv + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob)+ " " + String.format("%.2f", diem);
    }  
}
