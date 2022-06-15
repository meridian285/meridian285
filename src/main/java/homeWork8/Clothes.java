package homeWork8;

public class Clothes {
        private Colors color;
        protected String size;
        private String seasonClothes;

        public Clothes(Colors color, String size, String seasonClothes){
                this.color = color;
                this.size = size;
                this.seasonClothes = seasonClothes;
        }
        public Clothes(){}

        public Clothes(String size, String seasonClothes){
                this.size = size;
                this.seasonClothes = seasonClothes;
        }
        public void setColor(Colors color){
                this.color = color;
        }
        public Colors getColor(){
                return color;
        }
        public void setSeasonClothes(Season season){
                this.seasonClothes = seasonClothes;
        }
        public String getSeasonClothes(){
                return seasonClothes;
        }

        public void buyCloth(){
                System.out.println(Colors.Blue+" "+Season.Summer+" "+size);
        }
}
