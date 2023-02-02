package patterns.structural.proxy;

public class ProxyProject implements Project {
    private final String url;
    private ProjectImpl project;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (project==null) {
            project=new ProjectImpl(url);
        }
        project.run();
    }
}
