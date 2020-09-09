package people.members;

public enum MemberType
{
    FULL
    {
        @Override
        public String toString()
        {
            return "Full Member";
        }
    },
    BASIC
    {
        public String toString()
        {
            return "Basic Member";
        }
    }
}
