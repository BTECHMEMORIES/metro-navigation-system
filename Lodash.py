class Lodash:
    def to_lodash(self, raw_str: str) -> str:
        chrs = [' ', ',', '.', '-', '_']
        converted_str = ""
        sp_flag = False

        for str_char in raw_str:
            if str_char in chrs:
                if sp_flag:
                    converted_str += "-"
                    sp_flag = False
                continue
            else:
                sp_flag = True
                converted_str += str_char.lower()

        if converted_str.endswith('-'):
            converted_str = converted_str[:-1]

        return converted_str

    def to_normal(self, s: str) -> str:
        normal_str = ""
        f_flag = True

        for chr_ in s:
            if f_flag:
                normal_str += chr_.upper()
                f_flag = False
            elif chr_ == '-':
                normal_str += " "
                f_flag = True
            else:
                normal_str += chr_

        return normal_str
