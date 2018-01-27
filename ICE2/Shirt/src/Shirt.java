public class Shirt
    {
        private char colour;
        private double price;
        private String brand;

        public Shirt(char colour, double price)
        {
            this.colour = colour;
            this.price = price;
            brand = "brandless";
        }

        public Shirt(char colour, double price, String brand)
        {
            this.colour = colour;
            this.price = price;
            this.brand = brand;
        }

        public char getColour()
        {
            return colour;
        }

        public void setColour(char colour)
        {
            this.colour = colour;
        }

        public double getPrice()
        {
            return price;
        }

        public void setPrice(double price)
        {
            this.price = price;
        }

        public String getBrand()
        {
            return brand;
        }

        public void setBrand(String brand)
        {
            this.brand = brand;
        }

        public boolean isSameBrand(Shirt anotherShirt)
        {
            String anotherShirtBrand = anotherShirt.getBrand();

            return brand.equals(anotherShirtBrand);
        }



        public String toString()
        {
            return "Shirt[colour=" + colour + ",Price=" + price + ",Brand=" + brand + "]";
        }
    }


