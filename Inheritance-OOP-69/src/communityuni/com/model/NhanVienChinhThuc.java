package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien{
    // 2 constructor ko dc thua huong,phai tu khai bao
    public NhanVienChinhThuc(){
        super();
    }
    public NhanVienChinhThuc(int ma,String ten){
        super(ma, ten);
    }

    @Override
    public void tinhLuong() {
        super.tinhLuong();
        System.out.println("=> day la nhan vien chinh thuc");
    }
}