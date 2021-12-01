package DAY_8.com.demo.beans;

public class FACULTY extends PERSON {

        private String spsub;
        private String skills;
        protected float sal;

        public FACULTY() {
            System.out.println("Faculty default constructor");
        }

        public FACULTY(int id, String nm, String spsub, String skills, float sal) {
            super(id,nm);
            this.spsub = spsub;
            this.skills = skills;
            this.sal = sal;
        }

        public String getSpsub() {
            return spsub;
        }

        public String getSkills() {
            return skills;
        }

        public float getSal() {
            return sal;
        }

        public void setSpsub(String spsub) {
            this.spsub = spsub;
        }

        public void setSkills(String skills) {
            this.skills = skills;
        }

        public void setSal(float sal) {
            this.sal = sal;
        }

        @Override
        public String toString() {
            return super.toString()+"  Faculty [spsub=" + spsub + ", skills=" + skills + ", sal=" + sal + "]";
        }


    }



