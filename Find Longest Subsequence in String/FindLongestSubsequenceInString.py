
S = "abppplee"

D = {"able", "ale", "apple", "bale", "kangaroo", "", "abppee"}

# Given a string S and a set of words D, find the longest word in D that is a subsequence of S.
# Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.

# Note: D can appear in any format (list, hash table, prefix tree, etc.


def main():

    # Create a map to store letter locations and values
    dict = {}
    res = ""

    dict = mapString(S)

    #0(D) where D is equal to the number of words
    for word in D:
        if len(word) > len(D) or len(word) == 0:
            pass
        else:
            if checkSubSequence(word, dict) and len(word) > len(res):
                if len(word) > len(res):
                    res = word

    print(res)

    # algorithm is O(L*D+S)
    return res


# O(L) where L is equal the number of letters in word
def checkSubSequence(word, dict):

    #check if word is a subsequence order matters
    index = -1

    for letter in word:
        if letter in dict:
            pos = dict[letter]
            for i in pos:
                if index < i:
                    index = i
                    break


    return True

# O(S) where S is equal to the number of letters in S
def mapString(S):

    dict = {}

    for n in range(0, len(S)):

        letter = S[n]

        if letter not in dict:
            positions = []
            positions.append(n)
            dict[letter] = positions

        else:
            dict[letter].append(n)

    return dict

if __name__ == "__main__":
    main()
