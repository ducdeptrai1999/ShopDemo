package com.buiminhduc.model.request;

import com.buiminhduc.common.annotation.Column;

public class ProductRequest {
    private String tenSanPham;
    private String hinhAnh;
    private String thongTinChiTiet;
    private Integer giaBan;
    private Integer soLuong;
    private String mauSac;
    private String tag;
    private String trangThai;
    private Integer idMenuCon;

    public ProductRequest() {
    }

    public ProductRequest(String tenSanPham, String hinhAnh, String thongTinChiTiet, Integer giaBan, Integer soLuong, String mauSac, String tag, String trangThai, Integer idMenuCon) {
        this.tenSanPham = tenSanPham;
        this.hinhAnh = hinhAnh;
        this.thongTinChiTiet = thongTinChiTiet;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.tag = tag;
        this.trangThai = trangThai;
        this.idMenuCon = idMenuCon;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getThongTinChiTiet() {
        return thongTinChiTiet;
    }

    public void setThongTinChiTiet(String thongTinChiTiet) {
        this.thongTinChiTiet = thongTinChiTiet;
    }

    public Integer getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Integer giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getIdMenuCon() {
        return idMenuCon;
    }

    public void setIdMenuCon(Integer idMenuCon) {
        this.idMenuCon = idMenuCon;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", thongTinChiTiet='" + thongTinChiTiet + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", mauSac='" + mauSac + '\'' +
                ", tag='" + tag + '\'' +
                ", trangThai='" + trangThai + '\'' +
                ", idMenuCon=" + idMenuCon +
                '}';
    }
}
