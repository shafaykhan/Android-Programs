package com.shafay.hp.learn_android.model;

import java.util.Comparator;
import java.util.List;

/**
 * Created by hp on 24/07/2020.
 */

public class CodeGroup implements Comparator<CodeGroup> {

    private String CodeGroupTitle;
    private List<Code> Code;

    public CodeGroup() {
    }

    public CodeGroup(String codeGroupTitle, List<Code> code) {
        CodeGroupTitle = codeGroupTitle;
        Code = code;
    }

    public String getCodeGroupTitle() {
        return CodeGroupTitle;
    }

    public void setCodeGroupTitle(String codeGroupTitle) {
        CodeGroupTitle = codeGroupTitle;
    }

    public List<Code> getCode() {
        return Code;
    }

    public void setCode(List<Code> code) {
        Code = code;
    }

    @Override
    public int compare(CodeGroup c1, CodeGroup c2) {
        String codeGroup1 = c1.getCodeGroupTitle();
        String codeGroup2 = c2.getCodeGroupTitle();
        return codeGroup1.compareTo(codeGroup2);
    }
}
