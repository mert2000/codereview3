package cityBike;

        public class bike
        {
            static int count=0;
            int id;
            private int bikeID;
            private String color;
            private String state;

            public bike(String state,String color)
            {
                count=count+1;
                id=count;
                this.bikeID = bikeID;
                this.color=color;
                this.state=state;
            }

            public int getBikeID() {
                return id;
            }

            public void setBikeID(int bikeID) {
                this.bikeID = bikeID;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }
        }

