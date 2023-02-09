package koejad20.bplaced.net.genderequalibrium.bl;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;

public enum Gender implements Serializable, Parcelable {
    FEMALE,
    MALE,
    GENDERFLUID,
    POLYGENDER,
    NONBINARY,
    BIGENDER,
    GENDERQUEER,
    AGENDER;

    private final boolean GAY = true;
    static final long serialVersionUID = 182921787982173L;

    public static final Creator<Gender> CREATOR = new Creator<Gender>() {
        @NonNull
        @Override
        public Gender createFromParcel(@NonNull final Parcel in) {
            in.readBoolean();
            return Gender.valueOf(in.readString());
        }

        @NonNull
        @Override
        public Gender[] newArray(final int size) {
            return new Gender[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, final int flags) {
        dest.writeBoolean(GAY);
        dest.writeString(this.toString());
    }
}
