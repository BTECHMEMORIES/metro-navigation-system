from metro_map import MetroMap
from chennai_metro_map import ChennaiMetroMap
from hyd_metro_map import HydMetroMap
from lodash_util import Lodash


class DispStat:
    def __init__(self):
        self.ld = Lodash()

    def disp_list(self, all_stations):
        disp_list = []
        stats = []
        all_stat = sorted(all_stations)
        chr_val = '@'
        for stat in all_stat:
            if stat[0] == chr_val:
                stats.append(stat)
            else:
                if stats:
                    disp_list.append(list(stats))
                stats.clear()
                stats.append(stat)
                chr_val = stat[0]
        disp_list.append(list(stats))
        return disp_list

    def disp_list_str(self, station: MetroMap):
        all_stations = list(station.all_stations.keys())
        all_stations = [s for s in all_stations if "null" not in s]
        dis = self.disp_list(all_stations)
        disp_str = ""
        for dis_lis in dis:
            for stat_lis in dis_lis:
                disp_str += self.ld.to_normal(stat_lis) + "  ,"
            disp_str += "\n"
        disp_str = disp_str[:-2]
        return disp_str


if __name__ == "__main__":
    obj = DispStat()
    print(obj.disp_list_str(HydMetroMap()))


    public static void main(String args[]) {
        DispStat obj = new DispStat();

        ArrayList<ArrayList<String>> dis;

        System.out.print(obj.dispListStr(new HydMetroMap()));

    }
}

