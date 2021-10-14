package Two;

    public class CivicAddress extends Address{
        private String civicAddress;
        public enum corresponding{
            AB, BC, MB, NB, NL, NT, NS, NU, ON,
            PE, QC, SK, YT
        }
        public corresponding code;
        public CivicAddress() {
            civicAddress = "NULL";
            code = corresponding.AB;
        }
        public CivicAddress(String e, corresponding code) {
            civicAddress = e;
            this.code = code;
        }
        public CivicAddress(CivicAddress e) {
            civicAddress = e.civicAddress;
        }

        public corresponding getCode() {
            return code;
        }

        public void setCode(corresponding code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return "CivicAddress{" +
                    "civicAddress='" + civicAddress + '\'' +
                    ", code=" + code +
                    '}';
        }
    }

