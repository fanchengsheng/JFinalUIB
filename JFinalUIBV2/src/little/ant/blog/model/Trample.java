package little.ant.blog.model;

import little.ant.platform.annotation.Table;
import little.ant.platform.common.DictKeys;
import little.ant.platform.model.BaseModel;

import org.apache.log4j.Logger;

@SuppressWarnings("unused")
@Table(dataSourceName = DictKeys.db_dataSource_main, tableName = "blog_trample")
public class Trample extends BaseModel<Trample> {

	private static final long serialVersionUID = 6761767368352810428L;

	private static Logger log = Logger.getLogger(Trample.class);
	
	public static final Trample dao = new Trample();
	
	public static final String colunm_ids = "ids";
	public static final String colunm_version = "version";
	public static final String colunm_type = "type";
	public static final String colunm_targetids = "targetids";
	public static final String colunm_createuser = "createuser";
	public static final String colunm_createdate = "createdate";
	public static final String colunm_isdelete = "isdelete";
	public static final String colunm_deleteuser = "deleteuser";
	public static final String colunm_deletedate = "deletedate";
	
}
