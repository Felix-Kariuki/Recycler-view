package com.flexcode.recyclerview;

public class ModelClassRecycler {

    private int ivImage;
    private String tvName;
    private String tvTime;
    private String tvMessage;
    private String tvDivider;


    //CONSTRUCTOR SAME NAME AS CLASS NAME

    public ModelClassRecycler(int ivImage, String tvName, String tvTime, String tvMessage, String tvDivider) {
        this.ivImage = ivImage;
        this.tvName = tvName;
        this.tvTime = tvTime;
        this.tvMessage = tvMessage;
        this.tvDivider = tvDivider;
    }


    //GENERATING GETTERS
    public int getIvImage() {
        return ivImage;
    }

    public String getTvName() {
        return tvName;
    }

    public String getTvTime() {
        return tvTime;
    }

    public String getTvMessage() {
        return tvMessage;
    }

    public String getTvDivider() {
        return tvDivider;
    }
}
