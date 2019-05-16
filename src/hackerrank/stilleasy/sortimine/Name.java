package hackerrank.stilleasy.sortimine;

public class Name implements Comparable<Name> {


        private final String firstName, lastName; //siin oluline final (immutable)

        public Name(String firstName, String lastName) {
            if (firstName == null || lastName == null)
                throw new NullPointerException();//et nimekomponendid oleksid kindlasti olemas
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String firstName() { return firstName; }
        public String lastName()  { return lastName;  }

        public boolean equals(Object o) {
            if (!(o instanceof Name))
                return false;
            Name n = (Name) o;
            return n.firstName.equals(firstName) && n.lastName.equals(lastName); //kuidast toimub objekti samasuse tuvastamine
        }

        public int hashCode() {
            return 31*firstName.hashCode() + lastName.hashCode();//oluline, et redefineerida equals -hashkood peab olema sama
        }

        public String toString() {
            return firstName + " " + lastName;//et oleks mõnus kollektsioonist välja võtta
        }

        public int compareTo(Name n) {
            int lastCmp = lastName.compareTo(n.lastName);//millist atribuuti võrreldakse
            return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));//kui perenimi osutub sellekssamaks, siis järgmiseks võrreldakse eesnimesid
        }
    }

