package com.kube.kube;

/**
 * Created by jutan on 2016-11-14.
 */

public class WorkspaceItem {
    int blockImage;
    int optionImage;
    String moduleNum;
    String timeOption;
    public String getModuleNum() {
        return moduleNum;
    }

    public void setModuleNum(String moduleNum) {
        this.moduleNum = moduleNum;
    }

    public int getBlockImage() {
        return blockImage;
    }

    public void setBlockImage(int blockImage) {
        this.blockImage = blockImage;
    }

    public int getOptionImage() {
        return optionImage;
    }

    public void setOptionImage(int optionImage) {
        this.optionImage = optionImage;
    }

    public String getTimeOption() {
        return timeOption;
    }

    public void setTimeOption(String timeOption) {
        this.timeOption = timeOption;
    }
}