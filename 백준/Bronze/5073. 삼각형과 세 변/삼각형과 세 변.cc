#include <iostream>
#include <cmath>

using namespace std;

int main()
{	
	int maxA = 0;
	int angle1, angle2, angle3;

	while (true) {
		cin >> angle1 >> angle2 >> angle3;

		if (angle1 == 0 && angle2 == 0 && angle3 == 0)
			break;

		maxA = max(max(angle1, angle2), angle3);
		int sum = 0;

		if (maxA == angle1) {
			sum = angle2 + angle3;
		}
		else if (maxA == angle2) {
			sum = angle1 + angle3;
		}
		else {
			sum = angle1 + angle2;
		}

		if (maxA >= sum) {
			cout << "Invalid" << "\n";
		}
		else {
			if (angle1 == angle2 && angle2 == angle3) {
				cout << "Equilateral" << "\n";
			}
			else {
				if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
					cout << "Isosceles" << "\n";
				}
				else {
					cout << "Scalene" << "\n";
				}
			}
		}

	}
	
	
	return 0;
}