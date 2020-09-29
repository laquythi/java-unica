package communityuni.com.model;

public class TamGiac {
    // co 2 loai : service method & support method
    // service method dung de cac lop khac goi toi,con support method chi su dung trong noi ham
    // vi du o duoi,tinhChuVi,tinhDienTich la service method(vi dc class TestTamGiac goi toi),trong khi tinhNuaChuVi(private) chi la support method
    // vi tinhNuaChuVi chi dc goi trong class TamGiac
    private double canhA;
    private double canhB;
    private double canhC;

    // constructor mac dinh
    public TamGiac(){
        this.canhA = this.canhB = this.canhC = 1;
        System.out.println("day la constructor mac dinh");
    }

    // constructor co doi so truyen vao
    public TamGiac(double canhA,double canhB,double canhC){
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    // getter & setter
    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    // service method tinhChuVi
    public double tinhChuVi(){
        return this.canhA + this.canhB + this.canhC;
    }

    // support method tinhNuaChuVi
    private double tinhNuaChuVi(){
        return tinhChuVi()/2;
    }

    // service method
    public double tinhDienTich(){
        double p = tinhNuaChuVi();
        double dienTich = Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
        return dienTich;
    }
}
