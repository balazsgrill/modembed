/**
 * 
 */
package hu.modembed.syntax.persistence.impl.earley;


/**
 * @author balazs.grill
 *
 */
public class ParserTable {

	private ParserLevel[] table = new ParserLevel[]{new ParserLevel()};
	
	public ParserLevel get(int level){
		if (table.length > level){
			if (table[level] == null){
				table[level] = new ParserLevel();
			}
		}else{
			ParserLevel[] newTable = new ParserLevel[level+1];
			System.arraycopy(table, 0, newTable, 0, table.length);
			table = newTable;
			table[level] = new ParserLevel();
		}
		return table[level];
	}

}
