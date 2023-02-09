package koejad20.bplaced.net.genderequalibrium.bl;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.Objects;

public class USSR implements Parcelable, Serializable {
    static final long serialVersionUID = 213212333342L;
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;
    private final String ipAddress;

    public USSR(final int id, @NonNull final String fName, @NonNull final String lName, @NonNull final String email, @NonNull final Gender gender, @NonNull final String ipAddress) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
        this.gender = gender;
        this.ipAddress = ipAddress;
    }

    protected USSR(@NonNull final Parcel in) {
        id = in.readInt();
        firstName = in.readString();
        lastName = in.readString();
        email = in.readString();
        gender = Gender.valueOf(in.readString());
        ipAddress = in.readString();
    }

    public static final Creator<USSR> CREATOR = new Creator<USSR>() {
        @NonNull
        @Override
        public USSR createFromParcel(@NonNull final Parcel in) {
            return new USSR(in);
        }

        @NonNull
        @Override
        public USSR[] newArray(final int size) {
            return new USSR[size];
        }
    };

    public int getId() {
        return id;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    @NonNull
    public Gender getGender() {
        return gender;
    }

    @NonNull
    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof USSR)) return false;
        USSR ussr = (USSR) o;
        return id == ussr.getId() && firstName.equals(ussr.getFirstName()) && lastName.equals(ussr.getLastName()) && email.equals(ussr.getEmail()) && gender == ussr.getGender() && ipAddress.equals(ussr.getIpAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, gender, ipAddress);
    }

    @NonNull
    @Override
    public String toString() {
        return "USSR{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int i) {
        parcel.writeInt(getId());
        parcel.writeString(getFirstName());
        parcel.writeString(getLastName());
        parcel.writeString(getEmail());
        parcel.writeString(getGender().toString());
        parcel.writeString(getIpAddress());
    }
}
