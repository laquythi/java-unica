package communityuni.com.model;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        super();
    }

    public HinhVuong(int chieuDai, int chieuRong) {
        super(chieuDai, chieuRong);
    }

    public HinhVuong(int doRong){
        super(doRong,doRong);
    }
}
