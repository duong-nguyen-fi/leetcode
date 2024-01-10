// Remove comment Leetcode
// https://leetcode.com/problems/remove-comments/submissions/
// runtime 100% Go
// Memory 50% Go

func removeComments(source []string) []string {
    is_block_comment := false
    var result []string
    var tmp string

    for _, line := range source {
        l := len(line)
        for i:=0; i< l; i++  {
            // if inline comment
            if ((line[i] == '/' && i+1 < l) && (line[i+1] == '/'  && !is_block_comment)){
                i=l
                continue
            }

            // if start of block comment
            if ((line[i]=='/' && i+1 < l ) && (line[i+1] == '*'  && !is_block_comment)){
                is_block_comment = true
                i++;
                continue;
            }

            // if end of block comment
            if ((line[i]=='*' && i+1 < l) && (line[i+1] == '/'  && is_block_comment)){
                is_block_comment = false
                i++;
                continue;
            }

            // if others character
            // Normal character
                if (!is_block_comment) {
                    tmp +=string(line[i])
                }

        } //for
         if (len(tmp) > 0 && !is_block_comment) {
            result = append(result, tmp)
            tmp = ""
        }

    } // for
    return result
}



