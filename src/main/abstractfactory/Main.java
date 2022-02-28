import factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.CompleteFactory");
            System.out.println("Ex 1: java Main listfactory.ListFactory");
            System.out.println("Ex 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Link bbc = factory.createLink("BBC News", "https:/www.bbc.com");
        Link cnn = factory.createLink("CNN News", "https:/www.cnn.com");

        Link us_yahoo = factory.createLink("yahoo!", "https://www.yahoo.com");
        Link jp_yahoo = factory.createLink("yahoo Jp!", "https://www.yahoo.co.jp");

        Link google = factory.createLink("google", "https://www.excite.com");
        Link excite = factory.createLink("excite", "https://www.google.com");

        Tray traynews = factory.createTray("News");
        traynews.add(bbc);
        traynews.add(cnn);

        Tray trayyahoo = factory.createTray("yahoo!");
        trayyahoo.add(bbc);
        trayyahoo.add(cnn);

        Tray traysearch = factory.createTray("Search Engine");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "hoge taro");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}