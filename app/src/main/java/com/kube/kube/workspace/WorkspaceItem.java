package com.kube.kube.workspace;

/**
 * Created by jutan on 2016-11-14.
 */

public class WorkspaceItem {
    public int blockImage;
    public int optionImage;
    String moduleNum;
    String numOption;
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

    public String getNumOption() {
        return numOption;
    }

    public void setNumOption(String numOption) {
        this.numOption = numOption;
    }
}
