class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a=int(a,2)
        b=int(b,2)
        c=a+b
        b=bin(c).replace("0b","")
        return b
        