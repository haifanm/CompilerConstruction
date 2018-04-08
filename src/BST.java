public class BST
{
    public SymbolTableNode root;

    public void put(String name, String type, int scope)
    {
        if ( root == null )
        {
            root = new SymbolTableNode(name, type, scope);
        }
        else
        {
            root.put(name, type, scope);
        }
    }

    public Object get( String key )
    {
        return root == null ? null : root.find( key );
    }

    void remove(String name){
        root = deleteTreeNode(root ,name);
    }

    private SymbolTableNode deleteTreeNode(SymbolTableNode root, String data) {
        SymbolTableNode cur = root;
        if(cur == null){
            return cur;
        }
        if(cur.name.compareTo(data)>0){
            cur.left = deleteTreeNode(cur.left, data);
        }else if(cur.name.compareTo(data)<0){
            cur.right = deleteTreeNode(cur.right, data);
        }else{
            if(cur.left == null && cur.right == null){
                cur = null;
            }else if(cur.right == null){
                cur = cur.left;
            }else if(cur.left == null){
                cur = cur.right;
            }else{
                SymbolTableNode temp  = findMinFromRight(cur.right);
                cur.name = temp.name;
                cur.right = deleteTreeNode(cur.right, temp.name);
            }
        }
        return cur;
    }

    private SymbolTableNode findMinFromRight(SymbolTableNode node) {
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}