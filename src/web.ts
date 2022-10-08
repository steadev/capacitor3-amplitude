import { WebPlugin } from '@capacitor/core';

import type { CapacitorAmplitudePlugin } from './definitions';

export class CapacitorAmplitudeWeb
  extends WebPlugin
  implements CapacitorAmplitudePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
