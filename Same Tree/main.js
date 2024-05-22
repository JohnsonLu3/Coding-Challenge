/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function(p, q) {
    
    const helper = (tree1, tree2) => {
        if(tree1 && !tree2) return false;
        if(!tree1 && tree2) return false;
        if(!tree1 && !tree2) return true;

        const {val: val1, left: left1, right: right1} = tree1
        const {val: val2, left: left2, right: right2} = tree2

        if(val1 != val2) return false;

        const leftCompare = helper(left1,left2)
        const rightCompare = helper(right1, right2)

        if(leftCompare && rightCompare) return true;
        return false;
    }

    const isSame = helper(p,q)