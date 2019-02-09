package ca.ulaval.ima.tp1;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Profil implements Parcelable {

    public static final Creator<Profil> CREATOR = new Creator<Profil>() {
        @Override
        public Profil createFromParcel(Parcel in) {
            return new Profil(in);
        }

        @Override
        public Profil[] newArray(int size) {
            return new Profil[size];
        }
    };

    private final String lastName;
    private final String firstName;
    private final Date date;
    private final String idul;

    public Profil(String lastName, String firstName, Date date, String idul) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.date = date;
        this.idul = idul;
    }

    public Profil(Parcel in) {
        this.lastName = in.readString();
        this.firstName = in.readString();
        this.date = (Date) in.readSerializable();
        this.idul = in.readString();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getDate() {
        return date;
    }

    public String getIdul() {
        return idul;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.lastName);
        parcel.writeString(this.firstName);
        parcel.writeSerializable(this.date);
        parcel.writeString(this.idul);
    }
}
