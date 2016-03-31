import org.omg.Messaging.SyncScopeHelper;

public abstract class Pizza {

	public String name;
	public String sauce;
	public String dough;
	public Object prepare() {
		// TODO Auto-generated method stub
		return "preparando "  + name ;
		
	}

}
