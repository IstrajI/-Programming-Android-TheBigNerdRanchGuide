package geoquiz.android.bignerdranch.com.geoquiz;

/**
 * Created by Влад on 30.03.2016.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mIsCheated;

    TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
        mIsCheated = false;
    }

    public int getQuestion() {
         return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public boolean isCheated() {
        return mIsCheated;
    }
    public void setCheated(boolean isCheated) {
        mIsCheated = isCheated;
    }

    public void setQuestion (int question) {
        mQuestion = question;
    }

    public void setTrueQuestion (boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
