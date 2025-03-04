package gr.aueb.cf.ch20.enums;

public enum Actor2 {
    CIVILIAN {
        @Override
        public String toRole(){
            return "ROLE_CIVILIAN";
        }
    },

    EMPLOYEE {
        @Override
        public String toRole(){
            return "ROLE_CIVILIAN";
        }
    },

    SUPER_ADMIN {
        @Override
        public String toRole(){
            return "ROLE_CIVILIAN";
        }
    };


    public abstract String toRole();
}
