package manila.classico.v2;

public class Main {

    public static void main(String[] args) {

        LandingPage landingPage = new LandingPage();
        landingPage.setLocationRelativeTo(null);
        landingPage.setResizable(false);
        landingPage.setVisible(true);
        
        ViewQueuePage viewQueuePage = new ViewQueuePage();
        viewQueuePage.setLocationRelativeTo(null);
        viewQueuePage.setVisible(true);
        
    }
    
}
