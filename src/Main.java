 public class Main {
            interface Phone {
                void whatis();
            }

            static class Iphone implements Phone {
                public void whatis() {
                    System.out.println("I am Iphone");
                }
            }

            static class Samsung implements Phone {
                public void whatis() {
                    System.out.println("I am Samsung");
                }
            }

            abstract static class PhoneFactory {
                abstract Phone createPhone();
            }

            static class IphoneFactory extends PhoneFactory {
                Phone createPhone() {
                    return new Iphone();
                }
            }

            static class SamsungFactory extends PhoneFactory {
                Phone createPhone() {
                    return new Samsung();
                }
            }


            public static void main(String[] args) {
                PhoneFactory iphoneFactory = new IphoneFactory();
                Phone iphone = iphoneFactory.createPhone();
                iphone.whatis();

                PhoneFactory samsungFactory = new SamsungFactory();
                Phone samsung = samsungFactory.createPhone();
                samsung.whatis();
            }

        }
