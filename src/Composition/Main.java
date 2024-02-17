package Composition;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Folder demo1 = new Folder();
        demo1.setName("phb_demo1");

        Folder sourceFiles = new Folder();
        sourceFiles.setName("Source Files");
        demo1.addSubFolder(sourceFiles);

        Folder phalcon = new Folder();
        phalcon.setName(".phalcon");
        sourceFiles.addSubFolder(phalcon);

        Folder app = new Folder();
        app.setName("app");
        sourceFiles.addSubFolder(app);

        Folder config = new Folder();
        config.setName("config");
        app.addSubFolder(config);

        Folder controllers = new Folder();
        controllers.setName("controllers");
        app.addSubFolder(controllers);

        Folder library = new Folder();
        library.setName("library");
        app.addSubFolder(library);

        Folder migrations = new Folder();
        migrations.setName("migrations");
        app.addSubFolder(migrations);

        Folder models = new Folder();
        models.setName("models");
        app.addSubFolder(models);

        Folder views = new Folder();
        views.setName("views");
        app.addSubFolder(views);

        Folder cache = new Folder();
        cache.setName("cache");
        sourceFiles.addSubFolder(cache);

        Folder publicFolder = new Folder();
        publicFolder.setName("public");
        sourceFiles.addSubFolder(publicFolder);

        File htacess = new File();
        htacess.setName(".htaccess");
        publicFolder.addFile(htacess);

        File htrouter = new File();
        htrouter.setName(".htrouter.php");
        publicFolder.addFile(htrouter);

        File index = new File();
        index.setName("index.html");
        publicFolder.addFile(index);

        Folder includePath = new Folder();
        includePath.setName("Include Path");
        demo1.addSubFolder(includePath);

        File removeFiles = new File();
        removeFiles.setName("Remove Files");
        demo1.addFile(removeFiles);

        System.out.println(Folder.print(demo1));

        sourceFiles.removeSubFolder(app);
        System.out.println(Folder.print(demo1));

        sourceFiles.removeSubFolder(publicFolder);
        System.out.println(Folder.print(demo1));

    }
}